$(document).ready(function(){
        $('.add-to-cart').click(function(msg, myYes){
            var name= $(this).attr('name');// day sp qua trang servlet addtocart
                $.ajax({
                   url:'addtocart',
                   type:'POST',
                   data:'pid='+name,
                success:function(response)
                {
                }
            });
      
        }); 
    (function($) {
        showSwal = function(type) {
            'use strict';
        if (type === 'auto-close') {
            swal({
                title: 'SUCCESS!!!',
                text: 'PRODUCT HAS BEEN ADD TO CART',
                type: "success",
                timer: 2000,
                button: false
            })
            }else{
                swal("Error occured !");
            }
            }
    })(jQuery);
 });

 