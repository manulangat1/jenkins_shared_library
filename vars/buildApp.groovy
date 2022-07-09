#!/usr/bin/env groovy
def call () { 
    echo "Building app"
    sh "npm install"
}