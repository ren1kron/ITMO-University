import timeit
import time
from formal_dop3 import formal
from main_task import main_task

from reg_dop2 import reg
from libs_dop1 import libs

if __name__ == "__main__":

    st = time.time()
    for _ in range(100):
        main_task.start()
    fin = time.time()
    print(f"Обязательное задание: {fin - st}")

    st2 = time.time()
    for _ in range(100):
        libs.start()
    fin2 = time.time()
    print(f"Библиотека (Доп. 1): {fin2 - st2}")

    st = time.time()
    for _ in range(100):
        reg.start()
    fin = time.time()
    print(f"Регулярки (Доп. 2): {fin - st}")

    st = time.time()
    for _ in range(100):
        formal.start()
    fin = time.time()
    print(f"Формальные грамматики (Доп. 3): {fin - st}")