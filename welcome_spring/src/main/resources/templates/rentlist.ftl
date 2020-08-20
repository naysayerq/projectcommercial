<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rent list</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>
<body>
<div>
    <table class="table table-dark">
        <tr>
            <th>Space</th>
            <th>Client</th>
            <th>CreatedAt</th>
            <th>UpdatedAt</th>
        </tr>
        <#list list as item>
            <tr>
                <td>${item.space}</td>
                <td>${item.client}</td>
                <td>${item.createdAt}</td>
                <td>${item.updatedAt}</td>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>