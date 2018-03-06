package com.automattic.android.fetchstyle

import org.gradle.api.Plugin
import org.gradle.api.Project

class FetchStylePlugin implements Plugin<Project> {
    private static final BASE_URL = "https://raw.githubusercontent.com/Automattic/style-config-android/develop/config/"

    void apply(Project project) {
        project.task('downloadConfigs') {
            dependsOn 'downloadCheckstyleConfig'
            dependsOn 'downloadEditorConfig'
            dependsOn 'downloadIDEAConfig'
            dependsOn 'downloadIDEAInspectionConfig'
        }

        project.task('downloadCheckstyleConfig', type: DownloadTask) {
            target = new File('config')
            urls = formatUrls([ 'checkstyle.xml' ])
        }

        project.task('downloadEditorConfig', type: DownloadTask) {
            target = new File('.')
            urls = formatUrls([ '.editorconfig' ])
        }

        project.task('downloadIDEAConfig', type: DownloadTask) {
            target = new File('.idea')
            urls = formatUrls([
                    'idea/encodings.xml',
                    'idea/checkstyle-idea.xml',
                    'idea/codeStyleSettings.xml',
                    'idea/compiler.xml',
                    'idea/encodings.xml',
                    'idea/externalDependencies.xml',
                    'idea/vcs.xml'])
        }

        project.task('downloadIDEAInspectionConfig', type: DownloadTask) {
            target = new File('.idea/inspectionProfiles')
            urls = formatUrls([
                    'idea/inspectionProfiles/Project_Default.xml',
                    'idea/inspectionProfiles/profiles_settings.xml'])
        }
    }

    def formatUrls = { List files -> files.collect { BASE_URL + it } }
}
