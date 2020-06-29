  $(document).ready(function(){
                
//                 onclick="document.location='new'"
                
                $('.btn-success').on('click',function(){
                    
                    document.location="/new";
                });
                
                $('#table').on('click','.btn-primary',function(){
               
               let currentRow= $(this).closest("tr");
               
               let name=currentRow.find("td:eq(0)").text();
               let surname=currentRow.find("td:eq(1)").text();
               let subject=currentRow.find("td:eq(2)").text();
               
                let data = "/edit/"+name+"/"+surname+"/"+subject;
               
               document.location= data;
         
           });
       
                             $('#table').on('click','.btn-danger',function(){
               
               let currentRow= $(this).closest("tr");
               
               let name=currentRow.find("td:eq(0)").text();
               let surname=currentRow.find("td:eq(1)").text();
               let subject=currentRow.find("td:eq(2)").text();
               
                let data = "/kill/"+name+"/"+surname+"/"+subject;
               
               document.location= data;
         
           });   

                
                
            });
           
            
