<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:htmlEscape defaultHtmlEscape="true"/>

<cms:pageSlot position="TopHeaderSlot" var="component" element="div" class="container">
	<cms:component component="${component}" />
</cms:pageSlot>

<cms:pageSlot position="SiteLogo" var="logo" limit="1">
     <cms:component component="${logo}"/>
</cms:pageSlot>
<%-- <header class="main-header main-header-md">
    <div class="container">
        <div class="row">
            <div class="col-sm-12 col-md-4">
                <div class="site-logo js-site-logo">
                    <cms:pageSlot position="SiteLogo" var="logo" limit="1">
                        <cms:component component="${logo}"/>
                    </cms:pageSlot>
                </div>
            </div>
        </div>
    </div>
</header> --%>