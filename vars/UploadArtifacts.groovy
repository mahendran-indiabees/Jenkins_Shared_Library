def call (def filetype,def filename,def artifact_id,def group_id,def Nexus_cred_Id,def repositoryName) 
{
	try 
	{
		nexusArtifactUploader artifacts: [[artifactId: artifact_id, classifier: '', file: filename, type: filetype]], 
		credentialsId: Nexus_cred_Id, 
		groupId: group_id, 
		nexusUrl: 'localhost:8081', 
		nexusVersion: 'nexus3', 
		protocol: 'http', 
		repository: repositoryName, 
		version: '1.0-SNAPSHOT'
	}
	catch(Exception th) {
		echo "Artifact upload failed. Please Check console log"
		throw th;
	}	
}