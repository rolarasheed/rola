FROM openjdk:11
WORKDIR /application
COPY Message.java .
COPY Receiver.java .
COPY Sender.java .
RUN javac Message.java Receiver.java Sender.java
CMD ["java", "Message"]

