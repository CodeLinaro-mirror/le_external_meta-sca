SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "93abf22cf9a62b915f724e433bde702995ac274865425fd4a76d1d9b5828da1a"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "types_psutil"
