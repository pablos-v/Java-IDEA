#### АУТЕНТИФИКАЦИЯ
GET https://MyVacAppServer.com/user/  
{  
Accept:application/json  
}
---
#### РЕГИСТРАЦИЯ
POST https://MyVacAppServer.com/user/  
{  
"login" : "userLogin",  
"email" : "userEmail"  
}
---
#### РЕГИСТРАЦИЯ ПЫЛЕСОСА
POST https://MyVacAppServer.com/user/  
{  
"login" : "userLogin",  
"vac" : "ID"  
}
---
#### ОБНОВЛЕНИЕ ПЫЛЕСОСА
GET https://MyVacAppServer.com/vac/firmware  
{  
Accept:application/json  
}
---
#### ПОЛУЧИТЬ КАРТУ
GET https://MyVacAppServer.com/vac/map  
{  
Accept:application/json  
}
---
#### ОБНОВИТЬ КАРТУ
PUT https://MyVacAppServer.com/vac/map  
{  
"name" : "Vacuum1",  
"map" : PointsArray[]  
}
---
#### ПОЛУЧИТЬ СТАТИСТИКУ
GET https://MyVacAppServer.com/vac/stat  
{  
Accept:application/json  
}
---
#### ПОЛУЧИТЬ ГРАФИК
GET https://MyVacAppServer.com/vac/shedule  
{  
Accept:application/json  
}
---
#### ОБНОВИТЬ ГРАФИК
PUT https://MyVacAppServer.com/vac/shedule  
{  
"VacName" : "Vacuum1",  
"shedule" : SheduleDict{}  
}