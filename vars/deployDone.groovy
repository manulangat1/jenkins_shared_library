#!usr/bin/env groovy 

def call (String imageName , Integer version ) { 

    echo "Deploy done, you will be receiving email shortly for branch $BRANCH_NAME"
    echo "Whoops, here we g $imageName $version"
}