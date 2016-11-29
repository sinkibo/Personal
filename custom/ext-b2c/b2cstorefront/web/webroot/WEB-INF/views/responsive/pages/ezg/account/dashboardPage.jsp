<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template"
	tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<template:page pageTitle="${pageTitle}">	
	<!--=== Content Container ===-->
	<form:form id="dashboardForm">
	<div class="bkgLitBlu pB40 clearfix">
		<!-- Dashboard Banner -->
		<img src="${ezgImagesPath}/dashboard/dashboard_banner.jpg"
			alt="Banner" class="w100pcnt posR" />
		<div class="container pB40 clearfix">
			<!-- Left toc nav begins here-->
			<aside class="col_3 col_sm_4 mTN230 pL0">
				<cms:pageSlot position="LeftNavTop" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="LeftNavBottom" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
			</aside>
			<!-- Right Side Content begins here-->
			<section class="col_9 col_sm_6_67pc">
				<cms:pageSlot position="RightContentTop" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
				<cms:pageSlot position="RightContentBottom" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
			</section>
		</div>
		<!--=== End Deals for travellers ===-->
	</div>
	</form:form>
	<!--=== End Content Container ===-->
</template:page>

<script type="text/javascript">
$(document).ready(function(){
	ACC.account.disablePages('dashboardForm','${fullContextPath}', ${active})
});
</script>