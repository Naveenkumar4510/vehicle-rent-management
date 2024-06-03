# Use the official Tomcat image as base
FROM tomcat:latest

# Remove existing webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file to Tomcat's webapps directory
COPY FCApp.war /usr/local/tomcat/webapps/FCApp.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
