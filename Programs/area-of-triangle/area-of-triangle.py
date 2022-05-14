def areaTriangle(a, b, c):
    area = ((a + b + c) / 2*((a + b + c) / 2-a)*((a + b + c) / 2-b)*((a + b + c) / 2-c)) ** 0.5
    return area

sideA = input("Enter a: ")
sideB = input("Enter b: ")
sideC = input("Enter c: ")

print("Area of triangle: " + str(areaTriangle(int(sideA), int(sideB), int(sideC))))
