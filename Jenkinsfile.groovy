node {       
   def workspace = pwd() 
   load "${workspace}@script/esb_deploybar_pipeline/Jenkinsfile.groovy"
}