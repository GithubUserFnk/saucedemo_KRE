pipeline {

    agent {
        label 'Windows'
    }

    environment {
        KRE_HOME = 'C:\\katalon\\KRE_11.5'
        TESTOPS_PROJECT_ID = '1236067'
    }

    stages {

        stage('Katalon Runtime Engine Demo') {

            steps {

                withCredentials([
                    string(
                        credentialsId: 'katalon-qarius-apikey',
                        variable: 'KATALON_API_KEY'
                    )
                ]) {

                    bat """
                    "${KRE_HOME}\\katalonc.exe" ^
                    -noSplash ^
                    -runMode=console ^
                    -projectPath="%WORKSPACE%\\saucedemo.prj" ^
                    -retry=0 ^
                    -testSuitePath="Test Suites/Checkout/Checkout" ^
                    -browserType="Chrome (headless)" ^
                    -executionProfile="default" ^
                    -apiKey="%KATALON_API_KEY%" ^
                    -testOpsProjectId=%TESTOPS_PROJECT_ID% ^
                    --config ^
                    -proxy.auth.option=NO_PROXY ^
                    -proxy.system.option=NO_PROXY ^
                    -proxy.system.applyToDesiredCapabilities=true ^
                    -webui.autoUpdateDrivers=true ^
                    -ai.provider="katalon_ai"
                    """
                }
            }
        }
    }


    post {

        always {

            echo 'Collecting Katalon execution reports...'

            archiveArtifacts(
                artifacts: '**/Reports/**/*, **/Screenshots/**/*, **/logs/**/*',
                allowEmptyArchive: true,
                fingerprint: true
            )

        }


        success {

            echo '''
            =====================================
            KATALON EXECUTION SUCCESS
            Report uploaded to TestOps
            =====================================
            '''

        }


        failure {

            echo '''
            =====================================
            KATALON EXECUTION FAILED
            Check archived reports
            =====================================
            '''

        }
    }
}