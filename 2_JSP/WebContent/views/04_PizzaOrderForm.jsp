<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="dateprint.jsp"%>
	
		<h2>피자 아카데미</h2>
		
	<form action="/jsp/pizza" method="post">
	
		<br>

		<table border="1" style='border-collapse:collapse'>
			<tr>
				<th>종류</th>
				<th>이름</th>
				<th>가격</th>
				<th></th>
				<th>종류</th>
				<th>이름</th>
				<th>가격</th>
			</tr>
			<tr>
				<td rowspan="5">피자</td>
				<td>치즈피자</td>
				<td>5000</td>
				<td rowspan="11">&nbsp; &nbsp;</td>
				<td rowspan="11">사이드</td>
				<td>오븐구이통닭</td>
				<td>9000</td>
			</tr>
			<tr>
				<td>콤비네이션피자</td>
				<td>6000</td>
				<td>치킨스틱&윙</td>
				<td>4900</td>
			</tr>
			<tr>
				<td>포테이토피자</td>
				<td>7000</td>
				<td>치즈오븐스파게티</td>
				<td>4000</td>
			</tr>
			<tr>
				<td>고구마피자</td>
				<td>7000</td>
				<td>새우링&웨지감자</td>
				<td>3500</td>
			</tr>
			<tr>
				<td>불고기피자</td>
				<td>8000</td>
				<td>갈릭포테이토</td>
				<td>3000</td>
			</tr>
			<tr>
				<td rowspan="6">토핑</td>
				<td>고구마무스</td>
				<td>1000</td>
				<td>콜라</td>
				<td>1500</td>
			</tr>
			<tr>
				<td>콘크림무스</td>
				<td>1500</td>
				<td>사이다</td>
				<td>1500</td>
			</tr>
			<tr>
				<td>파인애플토핑</td>
				<td>2000</td>
				<td>갈릭소스</td>
				<td>500</td>
			</tr>
			<tr>
				<td>치즈토핑</td>
				<td>2000</td>
				<td>피클</td>
				<td>300</td>
			</tr>
			<tr>
				<td>치즈크러스트</td>
				<td>2000</td>
				<td>핫소스</td>
				<td>100</td>
			</tr>
			<tr>
				<td>치즈바이트</td>
				<td>3000</td>
				<td>파마산 치즈가루</td>
				<td>100</td>
			</tr>

		</table>

		<ul>
			<li>피자 : <select name="pizza">
					<option>치즈피자</option>
					<option>콤비네이션피자</option>
					<option>포테이토피자</option>
					<option>고구마피자</option>
					<option>불고기피자</option>
			</select>
			</li>


			<li>토핑 : 고구마무스<input type="checkbox" name="food" value="고구마무스" />
				콘크림무스<input type="checkbox" name="food" value="콘크림무스" /> 파인애플토핑<input
				type="checkbox" name="food" value="파인애플토핑" /> 치즈토핑<input
				type="checkbox" name="food" value="치즈토핑" /> 치즈크러스트<input
				type="checkbox" name="food" value="치즈크러스트" /> 치즈바이트<input
				type="checkbox" name="food" value="치즈바이트" />
			</li>


			<li>사이드 : 오븐구이통닭<input type="checkbox" name="food1"
				value="오븐구이통닭" /> 치킨스틱&윙<input type="checkbox" name="food1"
				value="치킨스틱&윙" /> 치즈오븐스파게티<input type="checkbox" name="food1"
				value="치즈오븐스파게티" /> 새우링&웨지감자<input type="checkbox" name="food1"
				value="새우링&웨지감자" /> 갈릭포테이토<input type="checkbox" name="food1"
				value="갈릭포테이토" /> 콜라<input type="checkbox" name="food1" value="콜라" />
				갈릭소스<input type="checkbox" name="food1" value="갈릭소스" /> 피클<input
				type="checkbox" name="food1" value="피클" /> 핫소스<input
				type="checkbox" name="food1" value="핫소스" /> 파마산 치즈가루<input
				type="checkbox" name="food1" value="파마산 치즈가루" />
			</li>
			<br>
			<li><input type="submit" value="확인"></li>
		</ul>
	</form>

</body>
</html>