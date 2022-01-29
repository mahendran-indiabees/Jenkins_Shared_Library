def call (def mvncmd) {
	try {
		echo "*****************************************************"
		echo "Maven build Started..."
		bat 'mvn '+mvncmd
		echo "Maven build completed successfully"
		echo "*****************************************************"
	}
	catch(Exception th) {
		echo "Maven build Failed. Please Check console log"
		throw th;
	}
}