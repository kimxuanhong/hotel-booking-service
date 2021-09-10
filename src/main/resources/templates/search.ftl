<#import "/spring.ftl" as spring/>
 
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet" type="text/css" href="<@spring.url '/css/style.css'/>"/>
   </head>
   <body>
      <h1>Welcome</h1>
      <#if message??>
      <h2>${message}</h2>
      </#if>
     <form name="person" action="" method="POST">
        First Name: <@spring.formInput "searchCriteria.personForm.firstName" "" "text"/>
        <br/>
        Last Name: <@spring.formInput "searchCriteria.personForm.lastName" "" "text"/>
        <br/>
        <input type="radio" name="searchBy" value="firstName">
        <label for="vehicle1"> Search By Fist Name</label><br>
        <input type="radio" name="searchBy" value="lastName">
        <label for="vehicle2"> Search By Last Name</label><br>
        <input type="submit" name="_eventId_search" value="Search" />
        <input type="submit" name="_eventId_proceed" value="Person List" />
     </form>
   </body>
    
</html>