import math
x = -4.5
y = 0.75*10**-4
z = -0.845*10**2
a = (9+(x-y)**2)**(1/3)
b = x**2+y**2+2
c = math.exp(abs(x-y))*((math.tan(z))**3)
s = a/b-c
print(s)