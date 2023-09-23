import math
x = 3.74*10**-2
y = -0.825
z = 0.16*10**2
a = (1+(math.sin(x+y)**2))
b = (abs(x-((2*y)/(1+x**2*y**2))))
c = (x**abs(y))
d = (math.cos(math.tan(1/z))**2)
s = a/b*c+d
print(s)