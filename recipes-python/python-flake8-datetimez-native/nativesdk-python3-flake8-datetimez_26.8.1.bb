SUMMARY = "A plugin for flake8 to ban the usage of unsafe naive datetime class"
HOMEPAGE = "https://github.com/pjknkda/flake8-datetimez"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63076aa9a63b95406f3e19969f678e2b"

PYPI_PACKAGE = "flake8_datetimez"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI[sha256sum] = "d060f3d2d4092e0d82509e00643745e68a9d7ad00842db5ff55a2dc25c0d86c8"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
