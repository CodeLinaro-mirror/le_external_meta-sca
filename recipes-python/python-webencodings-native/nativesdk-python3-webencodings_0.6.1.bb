SUMMARY = "Python implementation of the WHATWG Encoding standard"
HOMEPAGE = "https://github.com/CourtBouillon/webencodings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://LICENSE;md5=78ecd9e2dd613fe63d51efca9b793f2c"

PYPI_PACKAGE = "webencodings"

SRC_URI[md5sum] = "47dfd43da448410f24fbc08d597ac72d"
SRC_URI[sha256sum] = "565f9ad031c702dae404e27a099e3e09186a3ab1b9520f06d215502b651fd910"

inherit pypi
inherit python_flit_core
inherit_defer nativesdk
