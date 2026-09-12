SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=355d3a5771e66186070a92c2d218ca96"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-pip \
    nativesdk-python3-restructuredtext-lint \
    python3-wheel-native \
"

PYPI_PACKAGE = "flake8_rst_docstrings"

SRC_URI[sha256sum] = "a885cccfac9ff9b1e6d062ac0f8ba79a63fd0cf0fdcf220a5e3d7e6378acc7d0"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-restructuredtext-lint \
"
