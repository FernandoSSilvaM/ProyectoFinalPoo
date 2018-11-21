stack = []
AX = 0x0
BX = 0x0
CX = 0x0
DX = 0x0

#STACK
def MOV (register, dataMov):
    global AX
    global BX
    global CX
    global DX
    dataMov = int(dataMov, 16)

    if (register == "AX,"):
        AX = dataMov
    elif (register == "BX,"):
        BX = dataMov
    elif (register == "CX,"):
        CX = dataMov
    elif (register == "DX,"):
        DX = dataMov
    printEstatus()

def POP (register):
    global AX
    global BX
    global CX
    global DX

    if (register == "AX,"):
        AX  = stack.pop()
    elif (register == "BX,"):
        BX= stack.pop()
    elif (register == "CX,"):
        CX  = stack.pop()
    elif (register == "DX,"):
        DX  = stack.pop()

    printEstatus()
def PUSH(register):
    global AX
    global BX
    global CX
    global DX

    if (register == "AX,"):
        stack.append(AX)
    elif (register == "BX,"):
        stack.append(BX)
    elif (register == "CX,"):
        stack.append(CX)
    elif (register == "DX,"):
        stack.append(DX)
    else:
        stack.append(register)

    printEstatus()

#MAtematicas

def INC(register):
    global AX
    global BX
    global CX
    global DX

    if (register == "AX,"):
        AX = AX + 1
    if (register == "BX,"):
        BX = BX + 1
    if (register == "CX,"):
        CX = CX + 1
    if (register == "DX,"):
        DX = DX + 1
    printEstatus()


def DEC(register):
    global AX
    global BX
    global CX
    global DX
    if (register == "AX,"):
        AX -= 1
    elif (register == "BX,"):
        BX -= 1
    elif (register == "CX,"):
        CX -= 1
    elif (register == "DX,"):
        DX -= 1
    printEstatus()


def ADD(register, num):
    global AX
    global BX
    global CX
    global DX
    if num in ["AX", "BX", "CX","DX"]:
        num = globals()[num]
    else:
        num = int(num, 16)

    if (register == "AX,"):
        AX += num
    elif (register == "BX,"):
        BX += num
    elif (register == "CX,"):
        CX += num
    elif (register == "DX,"):
        DX += num
    printEstatus()

def SUB(register, num):
    global AX
    global BX
    global CX
    global DX
    if num in ["AX", "BX", "CX","DX"]:
        num = globals()[num]
    else:
        num = int(num, 16)

    if (register == "AX,"):
        AX -= num
    elif (register == "BX,"):
        BX -= num
    elif (register == "CX,"):
        CX -= num
    elif (register == "DX,"):
       DX -= num

    printEstatus()

def MUL(register):
    global AX
    global BX
    global CX
    global DX
    if (register == "AX,"):
        AX = AX*AX
    elif (register == "BX,"):
        AX = AX*BX
    elif (register == "CX,"):
        AX = AX*CX
    elif (register == "DX,"):
        AX = AX*DX

def DIV(register):
    global AX
    global BX
    global CX
    global DX
    if (register == "AX,"):
        DX = AX % AX
        AX = AX // AX
    elif (register == "BX,"):
        DX = BX % AX
        AX = BX // AX
    elif (register == "CX,"):
        DX = CX % AX
        AX = CX // AX
    elif (register == "DX,"):
        DX = DX % AX
        AX = DX // AX


def printEstatus():
    print("STACK")
    for x in range(len(stack)):
        print(stack[x])
    print("                     ")
    print("AX =     ", hex(AX))
    print("BX =     ", hex(BX))
    print("CX =     ", hex(CX))
    print("DX =     ", hex(DX))
    print("                      ")
    print("                      ")


def AND(register, Op2):
    global AX
    global BX
    global CX
    global DX
    if Op2 in ["AX", "BX", "CX","DX"]:
        Op2 = globals()[Op2]
    else:
        Op2 = int(Op2, 16)

    y =globals()[register[:2]]
    Op1 = int(bin(y),2)
    Op2 = int(bin(Op2), 2)

    if (register == "AX,"):
        AX = int(hex(Op1.__and__(Op2)), 16)
    elif (register == "BX,"):
        BX = int(hex(Op1.__and__(Op2)), 16)
    elif (register == "CX,"):
        CX = int(hex(Op1.__and__(Op2)), 16)
    elif (register == "DX,"):
        DX = int(hex(Op1.__and__(Op2)), 16)

    printEstatus()


def OR(register, Op2):
    global AX
    global BX
    global CX
    global DX
    if Op2 in ["AX", "BX", "CX", "DX"]:
        Op2 = globals()[Op2]
    else:
        Op2 = int(Op2, 16)

    y = globals()[register[:2]]
    Op1 = int(bin(y), 2)
    Op2 = int(bin(Op2), 2)

    if (register == "AX,"):
        AX = int(hex(Op1.__or__(Op2)), 16)
    elif (register == "BX,"):
        BX = int(hex(Op1.__or__(Op2)), 16)
    elif (register == "CX,"):
        CX = int(hex(Op1.__or__(Op2)), 16)
    elif (register == "DX,"):
        DX = int(hex(Op1.__or__(Op2)), 16)

    printEstatus()

def XOR(register, Op2):
    global AX
    global BX
    global CX
    global DX
    if Op2 in ["AX", "BX", "CX", "DX"]:
        Op2 = globals()[Op2]
    else:
        Op2 = int(Op2, 16)

    y = globals()[register[:2]]
    Op1 = int(bin(y), 2)
    Op2 = int(bin(Op2), 2)

    if (register == "AX,"):
        AX = int(hex(Op1.__xor__(Op2)), 16)
    elif (register == "BX,"):
        BX = int(hex(Op1.__xor__(Op2)), 16)
    elif (register == "CX,"):
        CX = int(hex(Op1.__xor__(Op2)), 16)
    elif (register == "DX,"):
        DX = int(hex(Op1.__xor__(Op2)), 16)

    printEstatus()

def NOT(register):
    global AX
    global BX
    global CX
    global DX

    if register in ["AX", "BX", "CX", "DX"]:
        Op1 = globals()[register[:2]]

    Op1 = int(bin(Op1),2)
    exp = Op1.bit_length()
    xor = 2**exp-1

    if (register == "AX"):
        AX = int(hex(Op1.__xor__(xor)), 16)
    elif (register == "BX"):
        BX = int(hex(Op1.__xor__(xor)), 16)
    elif (register == "CX"):
        CX = int(hex(Op1.__xor__(xor)), 16)
    elif (register == "DX"):
        DX = int(hex(Op1.__xor__(xor)), 16)

    printEstatus()

def leer(linea):
    #DATA
    if "MOV" in linea:
        MOV(linea[1], linea[-1]) #Ragistro, Variable

    elif "POP" in linea:
        POP(linea[1]) # Registro

    elif "PUSH" in linea:
        PUSH(linea[-1]) # Variable

    #ARITMETICA
    elif "INC" in linea:
        INC(linea[-1]) #registro

    elif "DEC" in linea:
        DEC(linea[-1]) #registro

    elif "ADD" in linea:
        ADD(linea[1], linea[-1]) #registro, numero

    elif "SUB" in linea:
        SUB(linea[1], linea[-1]) #registro, numero

    elif "MUL" in linea:
        MUL(linea[-1]) #Registro

    elif "DIV" in linea:
        DIV(linea[-1]) #Registro

    #Logico
    elif "CMP" in linea:
        CMP(linea[1], linea[-1]) #Operador 1, Operador 2 (Generalmente el Op1 es registro)

    elif "AND" in linea:
        AND(linea[1], linea[-1]) #IDEM

    elif "OR" in linea:
        OR(linea[1], linea[-1]) # IDEM

    elif "XOR" in linea:
        XOR(linea[1], linea[-1]) # IDEM

    elif "NOT" in linea:
        NOT(linea[-1]) # Operador 1

    #JUMPS
    elif ":" in linea:
        pass #ES UNA ETIQUETA...

    ####JUMPS###






def main():
    Asb = open("Test.txt", "r")
    Asb.readline()
    for line in Asb:
        line = line.upper()
        listLinea = line.split()
        print(listLinea)
        leer(listLinea)
    Asb.close()



'''
//DATA
MOV
POP
PUSH
//ARITMETICA
INC
DEC
ADD
SUB
MUL
DIV
//LOGICAL
CMP
AND
OR
XOR
NOT
//BRANCHES
JE
JNE
JZ
JNZ
JMP
'''

main()


#CAMBIA LOS AX, BX ETC, FUNCION DE COMPROBAR REGISTRO....
#SALTO DE LINEA