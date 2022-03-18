job('seed-external-job') {
  scm {
      git('https://github.com/Joel-MichaelWhite/jenkins-jobdsl.git')
  }
  steps {
    dsl {
      external('hello-world-external-seed/hello_world_external.groovy')
    }
  }
}