SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

DEPENDS += "\
    python3-chardet-native \
    python3-setuptools-scm-native \
    python3-six-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "python_debian"

SRC_URI[md5sum] = "3de53753e6333b9772bba314d09de2a8"
SRC_URI[sha256sum] = "fe4fc3dc798dbf1f0ef5865e2b1b4f7cc0352b6a511b25ab7594906c64a73629"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-six \
"
