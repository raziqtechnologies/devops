# Use the official Java base image
FROM raziqts/jdk_rts:latest

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/product-0.0.1-SNAPSHOT.jar /app/product.jar

# Expose the application's port
EXPOSE 8080

# Start the application
CMD ["java", "-jar", "/app/product.jar"]