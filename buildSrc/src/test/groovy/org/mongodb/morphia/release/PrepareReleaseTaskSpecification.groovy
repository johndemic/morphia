package org.mongodb.morphia.release

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class PrepareReleaseTaskSpecification extends Specification {
    def 'should be able to add the release task to the project'() {
        given:
        Project project = ProjectBuilder.builder().build()

        when:
        def task = project.task('release', type: PrepareReleaseTask)

        then:
        task instanceof PrepareReleaseTask
    }
}