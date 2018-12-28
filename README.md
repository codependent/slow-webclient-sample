# slow-webclient-sample

This project must be deployed as a war on Tomcat 9.

After accessing the controller path `/todos`: `http://localhost:8080/slow_webclient_sample_war/todos`, you can see that the initial request takes >6s. The next ones are faster ~30ms:

![alt text](https://raw.githubusercontent.com/codependent/slow-webclient-sample/master/browser-screenshot.png)


