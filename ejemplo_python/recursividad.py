# RECURSIVIDAD
def count_down(n):
    for i in range(n, -1, -1):
        print(i)
    print("Terminó la cuenta regresiva")

def count_down_recursive(n):
    if n < 0:
        print("Terminó la cuenta regresiva")
        return
    print(f"Cuenta {n}")
    count_down_recursive(n - 1)

# Llamadas a las funciones
count_down(100)
count_down_recursive(100)