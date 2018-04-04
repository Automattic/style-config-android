# style-config-android

Shared style configurations and scripts for Automattic Android apps.

## Use the library in your project

In your root build.gradle:

```groovy
buildscript {
    dependencies {
        classpath 'com.automattic.android:fetchstyle:1.1'
    }
}

apply plugin: 'com.automattic.android.fetchstyle'
```

You can now fetch/update the style config files using:

```shell
$ ./gradlew downloadConfigs
```

The files fetched are contained in [config/](config).

## Publish an updated version to your local maven repository

You can bump the [version name in the build file: `fetchstyle-gradle/build.gradle`][1]. After updating the build file, you can build, and publish the library to your local maven repo. That will let you try the new version in your app, for example.

```shell
$ ./gradlew assemble test publishToMavenLocal
```

## Publish it to Bintray

When a new version is ready to be published to the remote repository, use the following command to upload it to Bintray:

```shell
$ ./gradlew assemble test bintrayUpload -PbintrayUser=FIXME -PbintrayKey=FIXME -PdryRun=false
```

## Apps and libraries using style-config-android:

- [WordPress for Android][2]
- [FluxC][3]

## License

style-config-android is an Open Source project covered by the
[GNU General Public License version 2](LICENSE.md).

[1]: https://github.com/Automattic/style-config-android/blob/344268afbb9c6e1f52cc65d6e8d3e531859f14bd/fetchstyle-gradle/build.gradle#L24
[2]: https://github.com/wordpress-mobile/WordPress-Android
[3]: https://github.com/wordpress-mobile/WordPress-FluxC-Android
