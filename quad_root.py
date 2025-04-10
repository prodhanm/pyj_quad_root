from math import sqrt

def quadDisc(a, b, c):
    disc = (b**2) - (4 * a * c)
    return disc

def quadRootsPos(a, b, c):
    disc = quadDisc(a, b, c) 
    rootPos = (-b + sqrt(disc)) / (2 * a)
    return rootPos

def quadRootsNeg(a, b, c):
    disc = quadDisc(a, b, c)
    rootNeg = (-b - sqrt(disc)) / (2 * a)
    return rootNeg
    
def main():
    a = int(input("Enter the value of a: "))
    b = int(input("Enter the value of b: "))
    c = int(input("Enter the value of c: "))
    rootPlus = quadRootsPos(a, b, c)
    rootMinus = quadRootsNeg(a, b, c)
    if quadDisc(a, b, c) < 0:
        print("The equation has no real roots.")
        #return None
    elif quadDisc(a, b, c) == 0:
        print(f"The equation has one real root: {rootPlus:.2f}")
        #return roots
    else:
        print(f"The equation has two real roots: {rootPlus:.2f} and {rootMinus:.2f}")
        #return roots

if __name__ == "__main__":
    main()
