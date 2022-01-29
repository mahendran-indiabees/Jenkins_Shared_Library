def call (def giturl, def branch) {
	echo ""
	echo "********** Git URL:  ${giturl} **********"
	echo ""
	echo "********** Git Branch:  ${branch} **********"
	echo ""
	if(giturl.contains("github.com"))
	{
	checkout([$class: 'GitSCM', branches: [[name: branch ]], extensions: [], userRemoteConfigs: [
			[credentialsId: 'github', url: giturl]
		]])
	}
	else
	{
		error("Please Provide valid github url")
	}
}