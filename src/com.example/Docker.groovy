#!usr/bin/env groovy 

package com.example

class Docker implements Serializable {
    def script 

    Docker (script) {
        this.script = scipt
    }
    def buildDockerImage (String imageName) {

    script.echo "Deploy done, you will be receiving email shortly for branch $script.BRANCH_NAME"
    script.echo "Whoops, here we g $imageName " 

    }
    // def call () {
    //     echo "Building the docker image"
    //     // withCredentials ([usernamePassword(credentialsId:'docker-hub-repo',passwordVariable:'PASS', usernameVariable:'USER')]){
    //     //     sh "docker build -t ${USER}/${PROJECT_NAME}:${VERSION} ."
    //     //     sh "echo $PASS | docker login -u ${USER} --password-stdin"
    //     //     sh "docker push ${USER}/${PROJECT_NAME}:${VERSION}"
    //     }
}