def call(def SourceFile,def destinationPath)
{
	try {
		bat 'echo Stopping the Tomcat service'
		bat 'sc stop Tomcat9'
		bat 'ping 127.0.0.1 -n 6 > nul'
		bat 'echo Copy war file from workspace to Tomcat'
		bat "copy "+SourceFile+"  "+destinationPath
		bat 'echo Start the Tomcat service'
		bat 'sc start Tomcat9'
	}
	catch(Exception th) {
		echo "Tomcat deployment failed. Please Check console log"
		throw th;
	}		
}