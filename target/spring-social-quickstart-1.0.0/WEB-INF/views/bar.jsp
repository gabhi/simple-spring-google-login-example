<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:c="http://java.sun.com/jsp/jstl/core">

<div class="topbar">
	<div class="fill">
		<div class="container">
			<h3>
				<a href="./">Spring Social Google</a>
			</h3>

			<ul>
				<li class="${selected == 'profile' ? 'active' : ''}"><a href="./">Profile</a></li>
			</ul>
			
			<ul class="secondary-nav">
				<li><a href="signout">Sign Out</a></li>
			</ul>
		</div>
	</div>
</div>

</jsp:root>