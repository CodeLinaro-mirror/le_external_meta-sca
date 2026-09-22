SUMMARY = "JSON Web Token implementation in Python"
HOMEPAGE = "https://github.com/jpadilla/pyjwt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e4b56d2c9973d8cf54655555be06e551"

PYPI_PACKAGE = "PyJWT"

SRC_URI[sha256sum] = "77283c83fb56ecf566a886c757a714bc83668e38156de2cce8263302f42e0b86"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
