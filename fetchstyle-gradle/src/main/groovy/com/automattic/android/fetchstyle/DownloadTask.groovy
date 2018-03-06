package com.automattic.android.fetchstyle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction

class DownloadTask extends DefaultTask {
    @Input
    List urls = []

    @OutputDirectory
    File target

    @TaskAction
    void download() {
        urls.each { ant.get(src: it, dest: target) }
    }
}
