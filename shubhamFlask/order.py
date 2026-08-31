from flask import Flask
app = Flask(__name__)
@app.route('/order/<customer>/<product>/<int:quantity>/<int:price>')
def order(customer,product,quantity,price):
   total = quantity * price 

if total > 10000:
    discount= total * 0.15
else:
    discount = 0
    subtotal = total- discount
    gst = subtotal * 0.18
    final_amount = subtotal + gst
    return f"""
<h1>order summery<h1>
<hr>
<b>customer name:</b>{customer}<br><br>
<b>product:</b>{product}<br><br>
<b>quantity:</b>{quantity}<br><br>
<b>price:</b> Rs{price}<br><br>
<b>Total amount: </b> Rs{total}<br><br>
<b>Discount:</b> Rs{discount}<br><br>
<b>GST:</b> Rs{gst}<br><br>
<h2>Final Playeble Amount: Rs{final_amount:2f}</h2>
"""
if __name__ == "__main__":
    app.run(debug=True)
