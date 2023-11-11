#!/bin/bash

echo -e "–– Step 1\n"

mkdir lab0; cd lab0

touch murkrow0 ninjask9 pidgey1
mkdir -p cherubi4/masquerain patrat4/blastoise patrat4/pelipper purrloin1/venomoth

touch cherubi4/cherrim
touch cherubi4/roserade
touch cherubi4/butterfree
touch cherubi4/golem
touch cherubi4/hariyama

touch patrat4/metang
touch patrat4/meganium
touch patrat4/electivire
touch patrat4/sunflora

touch purrloin1/electabuzz
touch purrloin1/weepinbell
touch purrloin1/kirlia
touch purrloin1/bellsprout
touch purrloin1/ledyba


# -e для echo – включает поддержку вывода Escape последовательностей. Если не использовать данную опцию, на helios'e "\n", например, выведется именно как "\n", а не как перенос строки.
echo -e 'Способности  Overgrow Flower Gift Pick Up' > cherubi4/cherrim
echo -e 'Развитые\nспособности  Leaf Guard Technician' > cherubi4/roserade
echo -e 'Возможности  Overland=2\nSky=10 Jump=3 Power=3 Intelligence=4 Sinker=0' > cherubi4/butterfree
echo -e 'Тип покемона\nROCK GROUND' > cherubi4/golem
echo -e 'satk=4 sdef=6 spd=5' > cherubi4/hariyama

echo -e 'Тип диеты\nOmnivore' > murkrow0
echo -e 'Способности  Swarm Mach Speed Speed Boost\nSteadfast' > ninjask9
echo -e 'Способности  Last Chance Mach Speed Keen Eye Tangled\nFeet' > pidgey1

echo -e 'Живет  Cave' > patrat4/metang
echo -e 'weigth=221.6 height=71.0 atk=8\ndef=10' > patrat4/meganium
echo -e 'Ходы  Body Slam Counter Covet Double-Edge Fire\nPunch\U2021 Focus Punch Helping Hand Ice Punch Iron Tail Low Kick\U2021 Magnet\nRise Mega Kick Mega Punch Mud-Slap Rock Climb Seiscmic Toss Signal Beam\nSleep Talk Snore Swift Thunderpunch Uproar' > patrat4/electivire
echo -e 'satk=11 sdef=9\nspd=3' > patrat4/sunflora

echo -e 'Тип диеты  Ergovore Omnivore' > purrloin1/electabuzz
echo -e 'Тип диеты\nCanivore Phototroth' > purrloin1/weepinbell
echo -e 'Возможности  Overland=7 Surface=4 Jump=2\nPower=1 Intelligence=5 Telekinetic=0\nTelepath=0' > purrloin1/kirlia
echo -e 'Способности  Overgrow Venom Chlorophyll\nOblivious' > purrloin1/bellsprout
echo -e 'Способности  Swarm Mach Speed Early Bird Frisk' > purrloin1/ledyba

echo -e "–– Step 1 done\n"

# №1 - done

echo -e "–– Step 2...\n"

chmod 551 cherubi4
#chmod 640 cherubi4/cherrim
chmod o-r cherubi4/cherrim
#chmod 044 cherubi4/roserade
chmod u-rw cherubi4/roserade
#chmod 620 cherubi4/butterfree
chmod g=w cherubi4/butterfree
chmod o-r cherubi4/butterfree
chmod 400 cherubi4/golem
chmod 305 cherubi4/masquerain
#chmod 404 cherubi4/hariyama
chmod u-w cherubi4/hariyama
chmod o-r cherubi4/hariyama
chmod 660 murkrow0
chmod 004 ninjask9
#chmod 311 patrat4
chmod u=wx patrat4
chmod g=x patrat4
chmod o=x patrat4
#chmod 604 patrat4/metang
chmod g-r patrat4/metang
#chmod 620 patrat4/meganium
chmod g=w cherubi4/meganium
chmod o-r cherubi4/meganium
#chmod 737 patrat4/blastoise
chmod u+x patrat4/blastoise
chmod g=wx patrat4/blastoise
chmod o=wx patrat4/blastoise
#chmod 404 patrat4/electivire
chmod u-w patrat4/electivire
chmod g-r patrat4/electivire
chmod 064 patrat4/sunflora
#chmod 524 patrat4/pelipper
chmod u=rx patrat4/pelipper
chmod g=w patrat4/pelipper
chmod 046 pidgey1
chmod 513 purrloin1
chmod 644 purrloin1/electabuzz
chmod 770 purrloin1/venomoth
chmod 600 purrloin1/weepinbell
#chmod 444 purrloin1/kirlia
chmod u-w purrloin1/kirlia
chmod 620 purrloin1/bellsprout
chmod 640 purrloin1/ledyba

echo -e "–– Step 2 done\n"

# №2 - done

echo -e "–– Step 3...\n"
# 3.1
ln -s cherubi4 Copy_48

# 3.2
chmod u+r pidgey1
cp pidgey1 purrloin1/venomoth/
chmod u-r pidgey1

# 3.3
chmod u+r pidgey1
chmod u+w purrloin1
cat pidgey1 > purrloin1/weepinbellpidgey
chmod u-r pidgey1
chmod u-w purrloin1

# 3.4
ln -s ninjask9 patrat4/sunfloraninjask

# 3.5
chmod u+r pidgey1
chmod u+w purrloin1
ln pidgey1 purrloin1/bellsproutpidgey
chmod u-r pidgey1
chmod u-w purrloin1


# 3.6
chmod u+r patrat4
chmod u+w patrat4/pelipper
chmod u+r patrat4/sunflora

cp -rH patrat4 patrat4/pelipper

chmod u-r patrat4
chmod u-w patrat4/pelipper
chmod u-r patrat4/sunflora

# 3.7
cat purrloin1/weepinbell cherubi4/cherrim > pidgey1_19

echo -e "–– Step 3 done\n"

# №3 - done

echo -e "–– Step 4...\n"

# ls
# -l - вывод подробного списка
# -r - сортивать в обратном порядке
# -t - сортировать по уменьшению времени модификации
# -S - сортировать по размеру (сначала большие файлы)
# -R - рекурсивно отображать содержимое поддиректорий

# Жёсткие и символьные ссылки
# Жёсткая ссылка - это просто еще одно имя файла, которое ссылается на те же данные, что и первоначальное имя файла. Если удалить исходный файл, жёсткая ссылка всё равно будет работать, т.к. обращается к базовым данным, к которым обращалась реальная копия.
# Символьная ссылка - особый тип файла. Содержит запись адреса другого файла. Если удалить или переместить исходный файл, ссылка перестанет работать, станет битой. Может ссылаться на файлы, находящиеся на других дисках и на директории.
 

# 4.1
echo -e "4.1...\n"
#Подсчитать количество строк содержимого файлов: cherrim, roserade, butterfree, golem, hariyama, отсортировать вывод по уменьшению количества, подавить вывод ошибок доступа
wc -l cherubi4/cherrim cherubi4/roserade cherubi4/butterfree cherubi4/golem cherubi4/hariyama 2>/dev/null| sort -nr

# 4.2
echo -e "4.2...\n"
#Вывести рекурсивно список имен и атрибутов файлов в директории lab0, начинающихся на символ 'b', список отсортировать по возрастанию даты изменения записи о файле, подавить вывод ошибок доступа
#Ниже реализован поиск файлов, название которых начинается на 'b'
#ls -lrt b* */b* */*/b* */*/*/b* 2>/dev/null
#Ниже реализован поиск файлов, СОДЕРЖИМОЕ которых начинается на 'b'
ls -lrt $(grep -rl '\<b' . 2>/dev/null) # файлов, содержимое которых начинается на 'b' в lab0 не существует, поэтому команда выводит обычный полный список


# 4.3
echo -e "4.3...\n"
#Рекурсивно вывести содержимое файлов с номерами строк из директории lab0, имя которых начинается на 'm', строки отсортировать по имени a->z, ошибки доступа перенаправить в файл в директории /tmp
#grep -rnh ".*" ./m* ./*/m* ./*/*/m* ./*/*/*/m* 2> /tmp/opd_lab1_errors.log
cat -n $(ls -R ./m* ./*/m* ./*/*/m* ./*/*/*/m* 2>/tmp/opd_lab1_errors.log) 2>/tmp/opd_lab1_errors.log| sort

# 4.4
echo -e "4.4...\n"
#Подсчитать количество символов содержимого файлов: butterfree, golem, hariyama, metang, meganium, electivire, sunflora, electabuzz, weepinbell, kirlia, результат записать в файл в директории /tmp, ошибки доступа перенаправить в файл в директории /tmp
wc -m cherubi4/butterfree cherubi4/golem cherubi4/hariyama patrat4/metang patrat4/meganium patrat4/electivire patrat4/sunflora purrloin1/electabuzz purrloin1/weepinbell purrloin1/kirlia > /tmp/opd_lab1_symbols_cnt.log 2> /tmp/opd_lab1_errors.log

# 4.5
echo -e "4.5...\n"
#Вывести три первых элемента рекурсивного списка имен и атрибутов файлов в директории lab0, заканчивающихся на символ '4', список отсортировать по убыванию размера, подавить вывод ошибок доступа
(ls -lrS *4 */*4 */*/*4 */*/*/*4 | head -3) 2>/dev/null

# 4.6
echo -e "4.6...\n"
#Вывести рекурсивно список имен и атрибутов файлов в директории cherubi4, список отсортировать по убыванию даты доступа к файлу, подавить вывод ошибок доступа
ls -lrt cherubi4/* 2>/dev/null

echo -e "–– Step 4 done\n"

echo -e "–– Step 5...\n"

#rm -f ninjask9
#rm -f purrloin1/ledyba
#rm -f patrat4/sunfloraninja*
#rm -f purrloin1/bellsproutpidg*
#rm -rf cherubi4
#rm -f cherubi4/masquerain # выше уже удалили всю папку

rm ninjask9
rm purrloin1/ledyba
rm patrat4/sunfloraninja*
rm purrloin1/bellsproutpidg*
rm -r cherubi4
rm cherubi4/masquerain # выше уже удалили всю папку

echo -e "–– Step 5 done\n"
echo -e "–– Complete!\n"



#echo -e "test!!!"

# ниже попытки в 4.3 и немножко в 4.2. Вроде верное решение уже выше
#grep -lr "m" $(ls -R)
#(cat -b $(grep -lr '\<m' $(ls -R)) | sort) 2> /dev/null

#touch /tmp/list
#echo -e $(ls -1) > /tmp/list
#echo -e $(ls -1 cherubi4 patrat4 purrloin1) > /tmp/list
#cat /tmp/list
#rm /tmp/list
#ls -1 m* | ls cherubi4 -d m* | ls patrat4 -d m*

#(touch /tmp/list; echo -e $(ls -1) > /tmp/list; echo -e $(ls -1 cherubi4 patrat4 purrloin1) > /tmp/list; cat /tmp/list; rm /tmp/list) 2> /dev/null

#touch list
#echo -e $(ls -1) > list
#(echo -e $(ls -1 cherubi4 patrat4 purrloin1) > list) 2>/dev/null
#cat $((grep -r "\<m" list 2>/dev/null) | sort) 2>/dev/null
#rm list


#cat $(grep -r "\<m" $(ls -1)) 2>/dev/null

#(cat -n m*) && (cat -n patrat4/m*) && (cat -n cherubi4/m*) && (cat -n purrloin1/m*) 2>

#ls -l m* */m* */*/m* */*/*/m*
