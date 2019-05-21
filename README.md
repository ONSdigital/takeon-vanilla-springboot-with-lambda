# takeon-persistence-lambda
A vanilla spring boot application which is deployable to lambda

This is a simple spring boot application which only has the spring boot actuator added.

To package this service run:

*mvn package*

Once this is complete, ensure you have access to AWS using the awscli utility. Then enter the following three commands to deploy the lambda:


*aws cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket leon.lambda.test*

*aws cloudformation deploy --template-file output-sam.yaml --stack-name test-lambda-stack --capabilities CAPABILITY_IAM*

*aws cloudformation describe-stacks --stack-name test-lambda-stack*

Once the last command has been run, the root context url is shown within the **Outputs** section.

    {
        "Stacks": [
            {
                "StackId": "arn:aws:cloudformation:eu-west-2:014669633018:stack/test-lambda-stack/2f7ff2c0-77ae-11e9-8608-06afee4bb078",
                "StackName": "test-lambda-stack",
                "ChangeSetId": "arn:aws:cloudformation:eu-west-2:014669633018:changeSet/awscli-cloudformation-package-deploy-1558431544/898db81b-4937-4879-9191-38349d434977",
                "Description": "Persistence Test written with SpringBoot with the aws-serverless-java-container library",
                "CreationTime": "2019-05-16T07:42:41.660Z",
                "LastUpdatedTime": "2019-05-21T09:39:10.062Z",
                "RollbackConfiguration": {},
                "StackStatus": "UPDATE_COMPLETE",
                "DisableRollback": false,
                "NotificationARNs": [],
                "Capabilities": [
                    "CAPABILITY_IAM"
                ],
                "Outputs": [
                    {
                        "OutputKey": "PersistenceTestFunction",
                        "OutputValue": "https://awul9sol8f.execute-api.eu-west-2.amazonaws.com/Prod",
                        "Description": "URL for application",
                        "ExportName": "PersistenceTestFunction"
                    }
                ],
                "Tags": [],
                "EnableTerminationProtection": false
            }
        ]
    }

