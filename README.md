# Client-Server-in-Java
Client Server connection is made with the help of Java, where messages are exchanged, broadcasted, etc.

## How to run

Clone the project

### Program 1:

* Open cmd and run ```javac server1.java && java server1``` , keep it running.
* Open another cmd and run ```javac client1.java && java client1```
* Type the message in Client and see the responses in Server.
* Type "stop" to stop the connection.

### Program 2:

* Open cmd and run ``` javac server2.java && java server2 ``` , keep it running.
* Open another cmd and run for first client ```javac client2.java && java client2``` , keep it running.
* Open another cmd and run for second client ```javac client_2.java && java client_2```
* After the connections are made you will see the output of server date and time in first client and IP address and host name in the second client.

### Program 3:

-> Threading, Broadcasting

* Open cmd and run ```javac threadserver.java && java threadserver``` , keep it running.
* Open another 2 cmds and run ```javac cthread2.java && java cthread2```   ```javac cthread1.java && java cthread1```
* As the new clients get created the server assign new thread for clients.
* Exchange the messages, also the server message is broadcasted to all the clients.

### Program 4:

* Open cmd and run ```javac multithreadserver.java && java multithreadserver```
* Open any number of cmd and run ```javac multithreadclient.java && java multithreadclient```
* The message in client is shown in the server, any number of clients and their messages are received in the server.
