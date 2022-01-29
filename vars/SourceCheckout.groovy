def call (def giturl, def branch,def Git_Cred_ID) {
	echo ""
	echo "********** Git URL:  ${giturl} **********"
	echo ""
	echo "********** Git Branch:  ${branch} **********"
	echo ""
	if(giturl.contains("github.com"))
	{
	checkout([$class: 'GitSCM', branches: [[name: branch ]], extensions: [], userRemoteConfigs: [
			[credentialsId: Git_Cred_ID, url: giturl]
		]])
	}
	else
	{
		error("Please Provide valid github url")
	}
}