#!/bin/bash

curl -v -H "Content-Type:application/json" -X POST -d '
{
    "title" : "Mr",
    "firstName" : "Saman",
    "lastName" : "Ariyarathna",
    "dateOfBirth" : "17-03-1988",
    "nicOrPassportNo" : "880444555V",
    "country" : "Sri Lanka",
    "billingAddress" : "34A, Temple Road, Gangodawila, Nugegoda",
    "postalAddress" : "34A, Temple Road, Gangodawila, Nugegoda",
    "postalCode" : "10450",
    "mobileNo" : "+94777344111",
    "email" : "saman@test.com"
}'  http://bb.kandula:10003/user/register