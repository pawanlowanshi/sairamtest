<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 
<html>
<head>
<title>User Info</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-cookie/1.4.1/jquery.cookie.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://www.paypalobjects.com/api/checkout.js"></script>
</head>
<body>
<div class="container">
    <div class="dropdown btn btn-primary pull-right">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select Language
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a id="zh">CHINESE &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/china.png" width="50" height="30"></a></li>
      <li><a id="es">SPANISH &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/spanish.png" width="50" height="30"></a></li>
      <li><a id="en">ENGLISH &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/english.png" width="50" height="30"></a></li>
      <li><a id="ru">RUSSION &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/russion.png" width="50" height="30"></a></li>
      <li><a id="ja">JAPANESE &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/japanese.png" width="50" height="30"></a></li>
      <li><a id="de">GERMAN &nbsp;&nbsp;<img border="0" src="${pageContext.request.contextPath}/resources/images/german.png" width="50" height="30"></a></li>
    </ul>
  </div>
    <center>
     
    <h2 id="userInfoheading">User Info Page</h2>
 
    <h3><span id="userInfowelcome">Welcome</span> : ${pageContext.request.userPrincipal.name}</h3>
 
    <b id="userInfoprotectedmsg">This is protected page!</b>  
			<h1 id="userInfopaypalindicater">Please Click On Given Button For Payment<h1>
			<div id="paypal-button-container"></div>
		</center>
</div>
		<script>

			// Render the PayPal button

			paypal.Button.render({

				// Set your environment

				env: 'sandbox', // sandbox | production

				// PayPal Client IDs - replace with your own
				// Create a PayPal app: https://developer.paypal.com/developer/applications/create

				client: {
					sandbox:    'AZDxjDScFpQtjWTOUtWKbyN_bDt4OgqaF4eYXlewfBP4-8aqX3PiV8e1GWU6liB2CUXlkA59kJXE7M6R',
					production: 'Aco85QiB9jk8Q3GdsidqKVCXuPAAVbnqm0agscHCL2-K2Lu2L6MxDU2AwTZa-ALMn_N0z-s2MXKJBxqJ'
				},

				// Set to 'Pay Now'

				commit: true,

				// Wait for the PayPal button to be clicked

				payment: function() {

					// Make a client-side call to the REST api to create the payment

					return paypal.rest.payment.create(this.props.env, this.props.client, {
						intent:'sale',
						 payer:{
							    payment_method:'paypal'
							  },
						transactions: [
							{
								amount: { total: '0.01', currency: 'USD' }
							}
						]
					});
				},

				// Wait for the payment to be authorized by the customer
				onAuthorize: function(data, actions) {

					// Execute the payment

					return actions.payment.execute().then(function(param) {
						var res = param.transactions[0].related_resources[0].sale;
						console.log("data "+JSON.stringify(res.id));
						console.log("data "+JSON.stringify(res.state));

						document.getElementById('paypal-button-container').innerText = JSON.stringify(res.id)+" , "+JSON.stringify(res.state);
					});
				}

			}, '#paypal-button-container');

		</script>
		<script src="./resources/js/translate.js"></script>
</body>
</html>