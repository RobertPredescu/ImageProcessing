# Java Image Rotator

## Description

The Java Image Rotator project demonstrates the application of Object-Oriented Programming (OOP) principles to rotate BMP images at 90, 180, and 270 degrees. It emphasizes robust error handling, encapsulation, and code organization, providing a comprehensive example of image manipulation.

## Features

1. **Image Rotation:** Rotate BMP images at 90, 180, and 270 degrees with precision and efficiency.
2. **Object-Oriented Approach:** Employ OOP principles like encapsulation and inheritance to ensure code modularity and scalability.
3. **Exception Handling:** Implement robust error handling mechanisms to gracefully manage exceptions and unexpected scenarios.
4. **File I/O Handling:** Ensure reliable file input/output operations for reading BMP images and saving rotated images.
5. **User Interaction:** Provide a user-friendly interface for specifying image file paths and rotation angles.

## Implementation Details

1. **Image Handling:** 
   - Utilize Java's standard libraries to read BMP images and manipulate pixel data.
   - Implement a dedicated `BMPImage` class to encapsulate image-related operations.
2. **Rotation Algorithms:**
   - Implement rotation algorithms for 90, 180, and 270-degree rotations with careful consideration for accuracy and performance.
   - Modular design allows easy extension for additional rotation angles in the future.
3. **Main Class:**
   - Orchestrate the image rotation process based on user input.
   - Utilize the `ImageRotator` class to perform rotation operations.
4. **Exception Handling:**
   - Handle various exceptions, including invalid user input, file I/O errors, and unexpected runtime exceptions.
   - Utilize try-catch blocks and exception propagation to gracefully handle exceptions and provide informative error messages to the user.
5. **Code Documentation:**
   - Provide detailed comments and documentation within the codebase to enhance readability and maintainability.
   - Document exception types, conditions, and resolutions to assist developers in troubleshooting.

