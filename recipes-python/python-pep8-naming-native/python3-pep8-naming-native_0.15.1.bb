SUMMARY = "Naming Convention checker for Python"
HOMEPAGE = "https://github.com/PyCQA/pep8-naming"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LicenseRef-EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6aba56fb2ab6893b08fb8daa7eeba461"

DEPENDS += "python3-flake8-polyfill-native"

PYPI_PACKAGE = "pep8_naming"

SRC_URI[md5sum] = "0c691538417644ac7bc997737d9cf3ee"
SRC_URI[sha256sum] = "f6f4a499aba2deeda93c1f26ccc02f3da32b035c8b2db9696b730ef2c9639d29"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
"
