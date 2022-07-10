#!usr/bin/env groovy 
import com.example.Docker

def call (String imageName  ) { 

    return new Docker(this).buildDockerImage(imageName)
    // echo "Deploy done, you will be receiving email shortly for branch $BRANCH_NAME"
    // echo "Whoops, here we g $imageName "
}