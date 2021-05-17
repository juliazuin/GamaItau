$(()=>{
    $("#btnAdd").click(()=>{
        $("#tblDados tbody").append(`
        <tr>
            <td>#</td>
            <td>nome</td>
            <td>sobrenome</td>
            <td>nascimento</td>
        </tr>
        `)
    })
})