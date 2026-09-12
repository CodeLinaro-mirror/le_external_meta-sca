SUMMARY = "Python composable command line interface toolkit"
HOMEPAGE = "https://github.com/pallets/click"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI[md5sum] = "39f57e4f423de0d075dd968c29b01539"
SRC_URI[sha256sum] = "ba0d2089de75ea0310e2dde03160e6ca10009947fb95a182f9b54021bb272e34"

PYPI_PACKAGE = "click"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-datetime \
    nativesdk-python3-io \
    nativesdk-python3-shell \
"
