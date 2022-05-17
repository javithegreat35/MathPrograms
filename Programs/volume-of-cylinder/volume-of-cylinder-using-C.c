#include <stdio.h>
double pi = 3.141592653; // value of pi

int main() {
    double radius, height, volume;   

    printf("Enter radius of the cylinder: "); // asking user to give input for radius
    scanf("%lf", &radius); // user input for radius

    printf("Enter height of the cylinder: "); // asking user to give input for radius
    scanf("%lf", &height); // user input for radius
    
    volume = pi * radius * radius * height;    // calculating volume of cylinder

    printf("The volume of the cylinder is: %lf\n", volume); // printing volume of the cylinder
    
    return 0;
}

// Contributed By:- Ritesh-1310