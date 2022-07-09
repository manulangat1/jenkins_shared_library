#!/user/bin/env groovy
def call () {
    echo "Building the docker image"
    withCredentials ([usernamePassword(credentialsId:'docker-hub-repo',passwordVariable:'PASS', usernameVariable:'USER')]){
        sh "docker build -t ${USER}/${PROJECT_NAME}:${VERSION} ."
        sh "echo $PASS | docker login -u ${USER} --password-stdin"
        sh "docker push ${USER}/${PROJECT_NAME}:${VERSION}"
    }
    }
}