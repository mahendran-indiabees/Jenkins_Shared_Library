def call()
{
emailext attachLog: true, attachmentsPattern: 'Release_Status.csv', body: '''Hi Team,

***This is auto generated mail from local machine Jenkins !!!***

Job_Name :: Pipeline-CSVReader

Username :: Mahendran Irusappan

#Please find the attached result [Release_Status.csv]. Kindly check and confirm


Regards,
Mahendran Irusappan

''', subject: '[Jenkins_Pipeline]::[CSV Read] #BuildNumber : $BUILD_NUMBER #Status : $BUILD_STATUS', to: 'mahivalarmathi1@gmail.com'
}