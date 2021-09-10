<#import "/spring.ftl" as spring/>
 
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Welcome</title>
      <link rel="stylesheet"
           type="text/css" href="<@spring.url '/css/style.css'/>"/>
   </head>
    
   <body>
      <h1>Welcome</h1>
      <#if message??>
      <h2>${message}</h2>
      </#if>
     <form name="person" action="" method="POST">
        <input type="submit" name="_eventId_proceed" value="Person List" />
        <input type="submit" name="_eventId_cancel" value="Cancel" />
     </form>
   </body>
    
</html>